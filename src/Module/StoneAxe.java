package Module;

import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "using StoneChop ";
    }
}
