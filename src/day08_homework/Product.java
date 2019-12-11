package day08_homework;

/**
 * product的JavaBean
 * @author wangjj
 * @create 2019-12-11 20:13
 **/
@SuppressWarnings("all")
public class Product {
    private String pid;
    private String pname;
    private Integer price;
    private String flag;
    private String category_id;







    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "[" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", price='" + price + '\'' +
                ", flag='" + flag + '\'' +
                ", category_id='" + category_id + '\'' +
                ']';
    }
}
