package com.gigiozzz.testloadpath;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ApiResponseGenerationServiceCustom implements ApiResponseGeneration{


    @Override
    public Object genResponse(String name) {
        return new UserCustom(name, name, true);
    }

    @Data
    @AllArgsConstructor
    public static class UserCustom {
        private String username;
        private String name;
        private boolean active;
    }
}
