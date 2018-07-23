package cn.smbms.dao.provider;

import java.sql.Connection;
import java.util.List;
import cn.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;

public interface ProviderDao {
	
	/**
	 * 增加供应商
	 * @param
	 * @param provider
	 * @return
	 * @throws Exception
	 */
	public int add(Provider provider);


	/**
	 * 通过供应商名称、编码获取供应商列表-模糊查询-providerList
	 * @param
	 * @param proName
	 * @return
	 * @throws Exception
	 */
	public List<Provider> getProviderList(@Param("proName") String proName, @Param("proCode") String proCode);
	
	/**
	 * 通过proId删除Provider
	 * @param delId
	 * @return
	 * @throws Exception
	 */
	public int deleteProviderById(@Param("delId") String delId);
	
	
	/**
	 * 通过proId获取Provider
	 * @param
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Provider getProviderById(@Param("id") String id) ;
	
	/**
	 * 修改用户信息
	 * @return
	 * @throws Exception
	 */
	public int modify(Provider provider);
	
	
}
