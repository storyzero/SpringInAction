package concert;

import org.springframework.stereotype.Component;

/**
 * Created by seed on 2016. 6. 1..
 */
@Component(value="performance")
public class Concert implements Performance {

    @Override
    public void perform() {
        System.out.println("perform");
    }

    @Override
    public void perform(String name, String ext) {
        System.out.println(name + "." + ext);
    }
}
