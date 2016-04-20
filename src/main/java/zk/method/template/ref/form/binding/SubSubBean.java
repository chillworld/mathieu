package zk.method.template.ref.form.binding;

import java.math.BigInteger;
import java.security.SecureRandom;

public class SubSubBean {
    private String value;

    public SubSubBean() {
        value = new BigInteger(64, new SecureRandom()).toString(32);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
