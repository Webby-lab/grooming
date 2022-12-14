package project.groomer.models;

import org.apache.el.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Converter(autoApply = true)
public class AllergiesConverter implements AttributeConverter<List<Allergy>, String> {
    @Override
    public String convertToDatabaseColumn(List<Allergy> allergies) {
        if (allergies == null) {
            return null;
        }
        String text = "";
        for (Allergy allergy : allergies) {
            text += allergy.getText() + ", ";
        }
        return text.substring(0, text.length() - 2);
    }
    @Override
    public List<Allergy> convertToEntityAttribute(String dballergies) {
        if (dballergies == null) {
            return null;
        }
        String[] splitted = dballergies.split(", ");
        List<Allergy> aller = new ArrayList<>();
        for (Allergy all : Allergy.values()) {
            for (String s : splitted) {
                if (all.getText().equals(s)) {
                    aller.add(all);
                }
            }
        }return aller;
    }
}
