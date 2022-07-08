package com.rezzo.mes.resour.insp.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapperTest {

    @Autowired
    InspMapper mapper;

    @Test
    void getList() {
        mapper.getOrdrList(null);
    }

}
