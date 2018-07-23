package cn.smbms.dao.bill;

import java.sql.Connection;
import java.util.List;

import cn.smbms.pojo.Bill;
import org.apache.ibatis.annotations.Param;

public interface BillDao {
	/**
	 * 增加订单
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public int add(Bill bill) ;


	/**
	 * 通过查询条件获取供应商列表-模糊查询-getBillList
	 * @param
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public List<Bill> getBillList(Bill bill) ;
	
	/**
	 * 通过delId删除Bill
	 * @param
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteBillById(@Param("id") String delId);
	
	
	/**
	 * 通过billId获取Bill
	 * @param
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Bill getBillById(@Param("id") String id);
	
	/**
	 * 修改订单信息
	 * @param
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public int modify(Bill bill);

	/**
	 * 根据供应商ID查询订单数量
	 * @param
	 * @param providerId
	 * @return
	 * @throws Exception
	 */
	public int getBillCountByProviderId(@Param("providerId") String providerId) ;

}
