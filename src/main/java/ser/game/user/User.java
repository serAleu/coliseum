package ser.game.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String nickName;
}
