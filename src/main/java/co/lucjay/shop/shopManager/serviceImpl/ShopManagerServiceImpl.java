package co.lucjay.shop.shopManager.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.lucjay.shop.shopManager.dao.ShopManagerDao;
import co.lucjay.shop.shopManager.service.ShopManagerService;
import co.lucjay.shop.shopManager.service.CompanyMasterVo;

@Service("shop")
public class ShopManagerServiceImpl implements ShopManagerService {

	@Autowired
	ShopManagerDao dao;

	@Override
	public ArrayList<CompanyMasterVo> selectList() throws SQLException {
		return dao.selectList();
	}

	@Override
	public CompanyMasterVo getSelect(String key) throws SQLException {
		return dao.getSelect(key);
	}

	@Override
	public int insert(CompanyMasterVo vo) throws SQLException {
		return dao.insert(vo);
	}

	@Override
	public int update(CompanyMasterVo vo) throws SQLException {
		return dao.update(vo);
	}

	@Override
	public int delete(CompanyMasterVo vo) throws SQLException {
		return dao.delete(vo);
	}

}
