package xyz.apichiyu.project.service.impl;

import org.springframework.stereotype.Service;
import xyz.apichiyu.project.entity.BoothMobileAppointment;
import xyz.apichiyu.project.searchForm.BoothMobileAppointmentSearchForm;
import xyz.apichiyu.project.service.BoothMobileAppointmentService;

import java.util.List;
import java.util.Map;

@Service
public class BoothMobileAppointmentServiceImpl implements BoothMobileAppointmentService{

    @Override
    public boolean add(BoothMobileAppointment object) {
        return false;
    }

    @Override
    public boolean addAll(List<BoothMobileAppointment> list) {
        return false;
    }

    @Override
    public boolean delete(BoothMobileAppointment object) {
        return false;
    }

    @Override
    public boolean deleteAll(List<BoothMobileAppointment> list) {
        return false;
    }

    @Override
    public boolean deleteAll(BoothMobileAppointmentSearchForm form) {
        return false;
    }

    @Override
    public boolean deleteAll(String searchMapJson) {
        return false;
    }

    @Override
    public boolean deleteAll(Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public boolean update(BoothMobileAppointment object) {
        return false;
    }

    @Override
    public boolean updateAll(List<BoothMobileAppointment> list) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMobileAppointment object, BoothMobileAppointmentSearchForm form) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMobileAppointment object, String searchMapJson) {
        return false;
    }

    @Override
    public boolean updateAll(BoothMobileAppointment object, Map<String, Object> searchMap) {
        return false;
    }

    @Override
    public BoothMobileAppointment findById(String id) {
        return null;
    }

    @Override
    public BoothMobileAppointment find(BoothMobileAppointmentSearchForm form) {
        return null;
    }

    @Override
    public BoothMobileAppointment find(String searchMapJson) {
        return null;
    }

    @Override
    public BoothMobileAppointment find(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public List<BoothMobileAppointment> search(BoothMobileAppointmentSearchForm form) {
        return null;
    }

    @Override
    public List<BoothMobileAppointment> search(String searchMapJson) {
        return null;
    }

    @Override
    public List<BoothMobileAppointment> search(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public BoothMobileAppointmentSearchForm mapToForm(Map<String, Object> searchMap) {
        return null;
    }
}
