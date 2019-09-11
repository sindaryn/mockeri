package org.sindaryn.mockeri.service;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class NullCustomKeywords implements CustomKeywords {
    @Override
    public Map<String, List<Object>> customKeywords(){
        return new HashMap<>();
    }
}
