package cn.smbms.service.bill;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cn.smbms.tools.myBatisUtil;
import cn.smbms.dao.bill.BillDao;
import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("billService")
public class BillServiceImpl implements BillService {

	@Autowired
	@Qualifier("billDao")
	private BillDao billDao;

	public BillDao getBillDao() {
		return billDao;
	}

	public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}

	@Override
	public boolean add(Bill bill) {
		boolean flag = false;
		try {
			if(billDao.add(bill) > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	/**
	 * 查询订单列表
	 */
	public List<Bill> getBillList(Bill bill) {
		List<Bill> billList = null;
		System.out.println("query productName ---- > " + bill.getProductName());
		System.out.println("query providerId ---- > " + bill.getProviderId());
		System.out.println("query isPayment ---- > " + bill.getIsPayment());
		try {
			billList = billDao.getBillList(bill);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return billList;
	}

	@Override
	public boolean deleteBillById(String delId) {
		boolean flag = false;
		try {
			if(billDao.deleteBillById(delId) > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Bill getBillById(String id) {
		Bill bill = null;
		try{
			bill = billDao.getBillById(id);
		}catch (Exception e) {
			e.printStackTrace();
			bill = null;
		}
		return bill;
	}

	@Override
	public boolean modify(Bill bill) {
		boolean flag = false;
		try {
			if(billDao.modify(bill) > 0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
