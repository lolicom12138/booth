package xyz.apichiyu.project.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.apichiyu.project.entity.BoothMobileAppointment;
import xyz.apichiyu.project.searchForm.BoothMobileAppointmentSearchForm;

@Mapper
public interface BoothMobileAppointmentDao extends BaseDao<BoothMobileAppointment, BoothMobileAppointmentSearchForm> {
}
