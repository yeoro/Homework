package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.vo.Product;
import common.db.ConnectionFactory;

public class ProductDAO {

	// 전체 조회
	public List<Product> selectProduct() throws Exception {
		List<Product> list = new ArrayList<>(); 
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionFactory.getConnection();

			String query = "select code, name, price "
							+ "from product "
							+ "order by code";

			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Product b = new Product();
				b.setCode(rs.getString("code"));
				b.setName(rs.getString("name"));
				b.setPrice(rs.getInt("price"));
				
				list.add(b);
			}
			
		} finally {
			ConnectionFactory.close(pstmt, con);
		}
		
		return list;
	}
	
	// 상세 조회 (code로 검색)
	public Product selectProductByCode(String code) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Product p = new Product();
		
		try {
			con = ConnectionFactory.getConnection();

			String query = "select code, name, price "
							+ "from product "
							+ "where code = ?";

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, code);

			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			p.setCode(rs.getString("code"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt, con);
		}
		
		return p;
	}
	
	// 상품정보 저장
	public void insertProduct(Product product) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null; 
		
		try {
			con = ConnectionFactory.getConnection();
			
			String query = "insert into "
							+ "product("
								+ "code,"
								+ "name,"
								+ "price) "
							+ "values("
								+ "?,"
								+ "?,"
								+ "?)";
			
			pstmt = con.prepareStatement(query);
			
			int index = 6;
			pstmt.setString(index++, product.getCode());
			pstmt.setString(index++, product.getName());
			pstmt.setInt(index++, product.getPrice());
			pstmt.executeUpdate();
			
		} finally {
			ConnectionFactory.close(pstmt, con);
		}
	}
	
	// 상품정보 수정
	public void updateProduct(Product product, String code) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null; 
		
		try {
			con = ConnectionFactory.getConnection();
			
			String query = "update product "
							+ "set name = ?,"
							+ "    price = ? "
							+ "where code = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(Integer.parseInt(code), product.getName());
			pstmt.setInt(Integer.parseInt(code), product.getPrice());
			pstmt.setString(1, code);
			pstmt.executeUpdate();
			
		} finally {
			ConnectionFactory.close(pstmt, con);
		}
	}
	
	// 상품정보 삭제
	public void deleteProduct(String code) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null; 
		
		Product p = new Product();
		
		try {
			con = ConnectionFactory.getConnection();
			
			String query = "delete "
							+ "from product "
							+ "where code = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(Integer.parseInt(code), p.getCode());
			pstmt.executeUpdate();
			
		} finally { 
			ConnectionFactory.close(pstmt, con);
		}
	}
}
