package Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public Optional<String> ofNullable(){
        Optional<String>stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }

    public Optional<String> of(){
        Optional<String>stringOptional = Optional.of("Hello");
        return stringOptional;
    }

    public Optional<String> empty(){
        return Optional.empty();
    }

    public void Example(){
        System.out.println("ofNullable : " + ofNullable().isPresent());
        System.out.println("of : " + of());
        System.out.println("empty : " + empty());
    }
}
