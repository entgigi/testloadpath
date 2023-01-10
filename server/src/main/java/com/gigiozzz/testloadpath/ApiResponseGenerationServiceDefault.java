package com.gigiozzz.testloadpath;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class ApiResponseGenerationServiceDefault implements ApiResponseGeneration{


    @Override
    public Object genResponse(String name) {
        return new UserDefault(name);
    }

    @Data
    @AllArgsConstructor
    public static class UserDefault {
        private String name;
    }
}
