package zk.method.template.ref.form.binding;

import java.util.ArrayList;
import java.util.List;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.Form;
import org.zkoss.bind.annotation.BindingParam;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyViewModel {

    private List<MainBean> beans;
    private MainBean selectedBean;

    @Init
    public void init() {
        beans = new ArrayList<MainBean>() {
            private static final long serialVersionUID = 1L;

            {
                add(new MainBean("Bean 1"));
                add(new MainBean("Bean 2"));
                add(new MainBean("Bean 3"));
            }
        };
        setSelectedBean(beans.get(0));
    }

    public List<MainBean> getBeans() {
        return beans;
    }

    public MainBean getSelectedBean() {
        return selectedBean;
    }

    public void setSelectedBean(MainBean selectedBean) {
        this.selectedBean = selectedBean;
    }

    public SubSubBean getBean(SubBean bean, String key) {
        System.out.println("getting bean");
        SubSubBean subSubBean = bean.getSubSubBeans().get(key);
        if (subSubBean == null) {
            subSubBean = new SubSubBean();
            bean.getSubSubBeans().put((String) key, subSubBean);
        }
        return subSubBean;
    }

    @Command
    public void save() {

    }

    @Command
    public void change(@BindingParam("proxy") Form form) {
        System.out.println(form.getFormStatus().isDirty());
        BindUtils.postNotifyChange(null, null, form.getFormStatus(), ".");
    }

    @Command
    @NotifyChange("beans")
    public void add() {
        String name = "Bean " + (beans.size() + 1);
        beans.add(new MainBean(name));
    }
}
