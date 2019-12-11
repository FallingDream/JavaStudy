package day08_homework;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * dao层实现了基本增删改查的功能
 * @author wangjj
 * @create 2019-12-11 20:11
 **/
@SuppressWarnings("all")
public class ProductDao {
    //查询功能
    //1.查询全部
    public static List<Product> findAll() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from products";
        Object[] obj = {};
        return queryRunner.query(sql,new BeanListHandler<Product>(Product.class),obj);
    }

    //2.通过id查询
    public static Product findById(Integer pid) throws SQLException {;
        String sql = "select * from products where pid = ?";
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        Object[] obj = {pid};
        return queryRunner.query(sql,new BeanHandler<Product>(Product.class),obj);
    }

    //3.增加功能
    public static void add(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "insert into products (pname,price,flag,category_id) values (?,?,?,?)";
        Object[] obj = {product.getPname(),product.getPrice(),product.getFlag(),product.getCategory_id()};
        queryRunner.update(sql,obj);
    }

    //4.修改
    public static void update(Product product) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "update products set pname = ?,price = ?,flag = ?,category_id = ? where pid = ?";
        Object[] obj = {product.getPname(),product.getPrice(),product.getFlag(),product.getCategory_id(),product.getPid()};
        queryRunner.update(sql,obj);
    }

    //5.删除
    public static void delete(Integer pid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "delete from products where pid = ?";
        Object[] obj = {pid};
        queryRunner.update(sql,obj);
    }


}
