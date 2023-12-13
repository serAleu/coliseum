package ser.game.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ser.game.gladiators.BaseGladiator;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(of = {"nickName"})
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 3L;
    private String nickName;
    private BaseGladiator gladiator;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
