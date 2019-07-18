package Module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HALOXIAO implements Persion {

    private Axe axe;

    @Autowired(required = false)
    private void setAxe(Axe axe){
        this.axe = axe;
    }

    @Override
    public void use() {
        System.out.println("使用工具");
        System.out.println(axe.chop());
    }
}
