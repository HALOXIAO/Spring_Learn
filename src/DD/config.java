package DD;

import Module.HALOXIAO;
import Module.StoneAxe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = config.class)
@ComponentScan(basePackageClasses = {HALOXIAO.class, StoneAxe.class})
public class config {
}
