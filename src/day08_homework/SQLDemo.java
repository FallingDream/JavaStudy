package day08_homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * 结合SQL知识，实现对表的增删改查
 * @author wangjj
 * @create 2019-12-11 19:55
 **/
@SuppressWarnings("all")
public class SQLDemo {
    public static void main(String[] args) {

        //键盘输入功能
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //循环执行
        while (true){
            System.out.println("请输入想要执行的命令:");
            try {
                System.out.println("1.创建\n2.修改\n3.删除\n4.批量删除\n5.通过id查询\n6.查询所有\n7.退出");
                String choice = reader.readLine();
                switch (choice){
                    case "1":
                        System.out.println("创建");
                        addProduct(reader);sleep(2000);break;
                    case "2":
                        System.out.println("修改");
                        updateProduct(reader);sleep(2000);break;
                    case "3":
                        System.out.println("删除");
                        deleteProduct(reader);sleep(2000);break;
                    case "4":
                        System.out.println("批量删除");
                        deleteAll(reader);sleep(2000);break;
                    case "5":
                        System.out.println("通过id查询");
                        findById(reader);sleep(2000);break;
                    case "6":
                        System.out.println("查询所有");
                        findAll();sleep(2000);break;
                    case "7":
                        System.out.println("退出");System.exit(0);break;
                    default:
                        System.out.println("请输入正确的数字");break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    //查询全部
    public static void findAll(){
        ProductService productService = new ProductService();
        List<Product> products = null;
        try {
            products = productService.findAll();
            System.out.println("查询结果:");
            if (products!=null){
                for (Product temp:products){
                    System.out.println(temp);
                }
                System.out.println("共"+products.size()+"条记录");
            }else {
                System.out.println("没有查询到结果!");
            }
        } catch (SQLException e) {
            System.out.println("查询失败");
            e.printStackTrace();
        }

    }

    //通过id查询
    public static void findById(BufferedReader reader){

        try {
            //获得数据
            System.out.println("请输入要查询的编号:");
            String s = reader.readLine();
            Integer pidString = Integer.parseInt(s);

            //查询数据
            ProductService productService = new ProductService();
            Product product = productService.findById(pidString);

            if (product!=null){
                System.out.println("查询结果:"+product);
            }else {
                System.out.println("没有查询结果");
            }
        } catch (IOException e) {
            System.out.println("输入异常");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("查询失败");
            e.printStackTrace();
        }
    }

    //添加
    public static void addProduct(BufferedReader reader){

        try {
            //获得数据
            System.out.println("请输入商品名称:");
            String pname = reader.readLine();
            System.out.println("请输入商品价格:");
            String priceStr = reader.readLine();
            Integer price = Integer.parseInt(priceStr);
            Product product = new Product();
            product.setPname(pname);
            product.setPrice(price);
            product.setFlag("1");
            product.setCategory_id("c001");

            //与service层建立连接
            ProductService productService = new ProductService();
            productService.addProduct(product);
            System.out.println("添加成功");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("添加失败");
            e.printStackTrace();
        }
    }

    //更新
    public static void updateProduct(BufferedReader reader){


        try {
            //获得数据
            System.out.println("请输入要更新的id:");
            String pidStr = reader.readLine();
            Integer pid = Integer.parseInt(pidStr);

            //与service层建立连接
            ProductService productService = new ProductService();
            Product product = productService.findById(pid);
            if (product == null){
                System.out.println("商品不存在");
                return;
            }else {
                System.out.println("请输入想要更改的商品名称:");
                String name = reader.readLine();

                System.out.println("请输入想要更改的商品价格:");
                String priceStr = reader.readLine();
                Integer price = Integer.parseInt(priceStr);

                product.setPname(name);
                product.setPrice(price);

                productService.updateProduct(product);

                System.out.println("更新成功");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("修改异常");
            e.printStackTrace();
        }
    }

    //删除
    public static void deleteProduct(BufferedReader reader){
        try {
            //获取数据
            System.out.println("请输入想要删除的id:");
            String pidStr = reader.readLine();
            Integer pid = Integer.parseInt(pidStr);
            Product product = ProductDao.findById(pid);

            if (product == null){
                System.out.println("要删除的商品不存在");
                return;
            }else {
                ProductService productService = new ProductService();
                System.out.println("将要删除商品:"+product.getPname());
                System.out.println("是否删除？（y/n）");
                String flag = reader.readLine();

                if (flag.equalsIgnoreCase("y")){
                    productService.deleteProduct(pid);
                    System.out.println("删除成功");
                }else {
                    System.out.println("操作已取消");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("删除异常");
            e.printStackTrace();
        }
    }

    //批量删除
    public static void deleteAll(BufferedReader reader){
        try {
            System.out.println("进入批量删除模式,输入-1退出");
            List<Integer> list = new ArrayList<>();
            ProductService productService = new ProductService();

            while (true){
                System.out.println("请输入要删除的商品编号");
                String pidStr = reader.readLine();
                Integer pid = Integer.parseInt(pidStr);
                Product product = ProductDao.findById(pid);

                if (pid ==-1){
                    break;
                }
                if (product == null){
                    System.out.println("商品"+pid+"不存在");
                    continue;
                }else {
                    list.add(pid);
                    System.out.println("已标记要删除的商品"+product);
                }
            }
            System.out.println("已标记需要批量删除的商品,共"+list.size()+"个");
            System.out.println("是否删除？（y/n）");

            String yes = reader.readLine();
            if (yes.equalsIgnoreCase("y")){
                productService.deleteAll(list);
                System.out.println("删除成功");
            }else {
                System.out.println("操作已取消");
            }



        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("删除异常");
            e.printStackTrace();
        }
    }

}
