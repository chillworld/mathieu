package zk.method.template.ref.form.binding;

public class MainBean {
    private String name;
    private SubBean subBean;

    public MainBean() {
    }

    public MainBean(String name) {
        this();
        this.name = name;
        subBean = new SubBean();
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubBean getSubBean() {
        return subBean;
    }

    public String getName() {
        return name;
    }

    public void setSubBean(SubBean subBean) {
        this.subBean = subBean;
    }

}
