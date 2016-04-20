package zk.method.template.ref.form.binding;

import org.zkoss.zk.ui.ext.BeforeCompose;
import org.zkoss.zul.Combobox;

/**
 *
 * @author cossaer.f
 */
public class MyCombobox extends Combobox implements BeforeCompose {
    
    private static final String[] EVENTS = {"onKeyDown", "onKeyUp", "onKeyPress"};

    @Override
    public void beforeCompose() {
        setEventListeners("alert(this.getElementByClassName('z-combobox-selected'));"
                + "this.getElementByClassName('z-combobox-selected').scrollIntoView();");
    } 
    
    private void setEventListeners(String script) {
        for (String event : EVENTS) {
            setWidgetListener(event, script);
        }
    }
    
}
