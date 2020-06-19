package xyz.apichiyu.project.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import xyz.apichiyu.project.dao.FileStorageDao;
import xyz.apichiyu.project.entity.FileStorage;
import xyz.apichiyu.project.searchForm.FileStorageSearchForm;
import xyz.apichiyu.project.service.FileStorageService;
import xyz.apichiyu.project.util.JsonUtil;
import xyz.apichiyu.project.util.StringUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class FileStorageServiceImpl implements FileStorageService {
    private Logger logger = Logger.getLogger(FileStorageServiceImpl.class);
    private FileStorageDao fileStorageDao;

    @Autowired
    public FileStorageServiceImpl(FileStorageDao fileStorageDao) {
        this.fileStorageDao = fileStorageDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean add(FileStorage object) {
        object.setId(StringUtil.makeId(8));
        try {
            if (fileStorageDao.add(object) == 1) {
                return true;
            }
            throw new Exception("line num error");
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean addAll(List<FileStorage> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(StringUtil.makeId(8));
        }
        try {
            if (fileStorageDao.addAll(list) == list.size()) {
                return true;
            }
            throw new Exception("line num error");
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean delete(FileStorage object) {
        try {
            if (fileStorageDao.delete(object) == 1) {
                return true;
            } else {
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean deleteAll(List<FileStorage> list) {
        try {
            Iterator<FileStorage> ite = list.iterator();
            while (ite.hasNext()) {
                FileStorage fileStorage = ite.next();
                if (fileStorageDao.delete(fileStorage) == 1) {
                    continue;
                } else {
                    throw new Exception("line num error");
                }
            }
            return true;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean deleteAll(FileStorageSearchForm form) {
        try {
            return fileStorageDao.deleteAll(form) > 0;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    public boolean deleteAll(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.deleteAll(searchMap);
        }
        return false;
    }

    @Override
    public boolean deleteAll(Map<String, Object> searchMap) {
        FileStorageSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.deleteAll(form);
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean update(FileStorage object) {
        try {
            if (fileStorageDao.update(object) == 1) {
                return true;
            } else {
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean updateAll(List<FileStorage> list) {
        try {
            Iterator<FileStorage> ite = list.iterator();
            while (ite.hasNext()) {
                if (fileStorageDao.update(ite.next()) == 1) {
                    continue;
                }
                throw new Exception("line num error");
            }
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public boolean updateAll(FileStorage object, FileStorageSearchForm form) {
        try {
            return fileStorageDao.updateAll(object, form) > 0;
        } catch (Exception e) {
            logger.debug(e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }

    @Override
    public boolean updateAll(FileStorage object, String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.updateAll(object, searchMap);
        }
        return false;
    }

    @Override
    public boolean updateAll(FileStorage object, Map<String, Object> searchMap) {
        FileStorageSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.updateAll(object, form);
        }
        return false;
    }

    @Override
    public FileStorage findById(String id) {
        try {
            return fileStorageDao.findById(id);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public FileStorage find(FileStorageSearchForm form) {
        try {
            return fileStorageDao.findByForm(form);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public FileStorage find(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.find(searchMap);
        }
        return null;
    }

    @Override
    public FileStorage find(Map<String, Object> searchMap) {
        FileStorageSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.find(form);
        }
        return null;
    }

    @Override
    public List<FileStorage> search(FileStorageSearchForm form) {
        try {
            return fileStorageDao.searchByForm(form);
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

    @Override
    public List<FileStorage> search(String searchMapJson) {
        Map<String, Object> searchMap = JsonUtil.toObject(HashMap.class, searchMapJson);
        if (null != searchMap) {
            return this.search(searchMap);
        }
        return null;
    }

    @Override
    public List<FileStorage> search(Map<String, Object> searchMap) {
        FileStorageSearchForm form = this.mapToForm(searchMap);
        if (null != form) {
            return this.search(form);
        }
        return null;
    }

    @Override
    public FileStorageSearchForm mapToForm(Map<String, Object> searchMap) {
        FileStorageSearchForm form = new FileStorageSearchForm();
        try {
            if (searchMap.containsKey("url")) {
                form.setUrl((String) searchMap.get("url"));
            }
            if (searchMap.containsKey("filePath")) {
                form.setFilePath((String) searchMap.get("filePath"));
            }
            if (searchMap.containsKey("md5")) {
                form.setMd5((String) searchMap.get("md5"));
            }
            if (searchMap.containsKey("ext")) {
                form.setExt((String) searchMap.get("ext"));
            }
            if (searchMap.containsKey("id")) {
                form.setId((String) searchMap.get("id"));
            }
            if (searchMap.containsKey("page")) {
                form.setPage(Integer.parseInt((String) searchMap.get("page")));
            }
            if (searchMap.containsKey("pageRows")) {
                form.setPageRows(Integer.parseInt((String) searchMap.get("pageRows")));
            }
            if (searchMap.containsKey("sortBy")) {
                form.setSortBy((String) searchMap.get("sortBy"));
            }
            if (searchMap.containsKey("sortType")) {
                form.setSortType((String) searchMap.get("sortType"));
            }
            if (searchMap.containsKey("fuzzy")) {
                form.setFuzzy((Boolean) searchMap.get("fuzzy"));
            }
            return form;
        } catch (Exception e) {
            logger.debug(e);
            return null;
        }
    }

}
