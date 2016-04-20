package zk.method.template.ref.form.binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.zkoss.bind.annotation.Immutable;
import org.zkoss.bind.annotation.ImmutableElements;
import org.zkoss.bind.annotation.ImmutableFields;

public class SubBean {

    private Map<String, SubSubBean> subSubBeans;
    private List<String> strings;

    public SubBean() {
        strings = new ArrayList<String>() {
            private static final long serialVersionUID = 1L;

            {
                add("One");
                add("Two");
                add("Three");
                add("Four");
                add("Five");
                add("Six");
                add("Seven");
                add("Eight");
                add("Nine");
                add("Ten");
            }
        };
        subSubBeans = new HashMap<String, SubSubBean>();
    }

//    @Immutable
    public Map<String, SubSubBean> getSubSubBeans() {
        return subSubBeans;
    }

    public SubSubBean getSubSubBean(String key) {
        return subSubBeans.get(key);
    }

    public void setSubSubBeans(Map<String, SubSubBean> subSubBeans) {
        this.subSubBeans = subSubBeans;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
