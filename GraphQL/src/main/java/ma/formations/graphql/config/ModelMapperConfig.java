package ma.formations.graphql.config;

import lombok.AllArgsConstructor;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.util.Date;

@Configuration
@AllArgsConstructor
public class ModelMapperConfig {
    private CommonTools tools;

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().
                setMatchingStrategy(MatchingStrategies.LOOSE).
                setFieldMatchingEnabled(true).
                setSkipNullEnabled(true).
                setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
        Converter<Date, String> dateToStringConverter = new AbstractConverter<>() {
            @Override
            public String convert(Date date) {
                return tools.dateToString(date);
            }
        };
        Converter<String, Date> stringToDateConverter = new AbstractConverter<>() {
            @Override
            public Date convert(String s) {
                return tools.stringToDate(s);
            }
        };
        modelMapper.addConverter(dateToStringConverter);
        modelMapper.addConverter(stringToDateConverter);
        return modelMapper;
    }


}
