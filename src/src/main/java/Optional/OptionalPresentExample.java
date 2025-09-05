package Optional;

import java.util.Optional;

public class OptionalPresentExample {

    public void Example(){
        Optional<String>optionalVal = Optional.ofNullable("Hello Optional");
        Optional<String>optionalVal1 = Optional.ofNullable(null);
        System.out.println(optionalVal.isPresent());
        System.out.println(optionalVal1.isPresent());
        if(optionalVal.isPresent()){
            System.out.println(optionalVal.get());
        }

        optionalVal1.ifPresent(s -> System.out.println(s));
    }
}
