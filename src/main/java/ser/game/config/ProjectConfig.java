package ser.game.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Value("${gladiators.hoplomachus.health}")
    private int gladiatorsHoplomachusHealth;
    @Value("${gladiators.hoplomachus.armour}")
    private int gladiatorsHoplomachusArmour;
    @Value("${gladiators.hoplomachus.attack}")
    private int gladiatorsHoplomachusAttack;
    @Value("${gladiators.hoplomachus.speed}")
    private int gladiatorsHoplomachusSpeed;
    @Value("${gladiators.hoplomachus.luck}")
    private int gladiatorsHoplomachusLuck;
    @Value("${gladiators.retiarius.health}")
    private int gladiatorsRetiariusHealth;
    @Value("${gladiators.retiarius.armour}")
    private int gladiatorsRetiariusArmour;
    @Value("${gladiators.retiarius.attack}")
    private int gladiatorsRetiariusAttack;
    @Value("${gladiators.retiarius.speed}")
    private int gladiatorsRetiariusSpeed;
    @Value("${gladiators.retiarius.luck}")
    private int gladiatorsRetiariusLuck;
}