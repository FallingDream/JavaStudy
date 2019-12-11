package day08_homework;

import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * service层
 * @author wangjj
 * @create 2019-12-11 20:19
 **/
@SuppressWarnings("all")
public class ProductService {

    //查询所有
    public List<Product> findAll() throws SQLException {
        return  ProductDao.findAll();
    }

    //通过id查询
    public Product findById(Integer pid) throws SQLException {
        return ProductDao.findById(pid);
    }

    //添加
    public void addProduct(Product product) throws SQLException {
        ProductDao.add(product);
    }

    //修改
    public void updateProduct(Product product) throws SQLException {
        ProductDao.update(product);
    }

    //删除???
    public void deleteProduct(Integer pid){
        Connection conn = null;
        try {
            conn = C3P0Utils.getConnection();
            conn.setAutoCommit(false);
            ProductDao.delete(pid);

            DbUtils.commitAndClose(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //批量删除
    public void deleteAll(List<Integer> list){
        Connection conn = null;
        try {
            conn = C3P0Utils.getConnection();
            conn.setAutoCommit(false);


            if (list!=null){
                for (Integer id:list){
                    ProductDao.delete(id);
                }
            }

            DbUtils.commitAndClose(conn);
        } catch (SQLException e) {
            //回滚？
            DbUtils.rollbackAndCloseQuietly(conn);
            e.printStackTrace();
        }
    }
}
