package zk.method.template.ref.form.binding;

/**
 *
 * @author cossaer.f
 */
public final class HelperClass {
    public static Object getBean(SubBean bean, String key) {
        SubSubBean subSubBean = bean.getSubSubBeans().get(key);
        if (subSubBean == null) {
            subSubBean = new SubSubBean();
            bean.getSubSubBeans().put((String) key, subSubBean);
        }
        return subSubBean;
    }
}
