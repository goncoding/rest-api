package com.gon.restapi.events;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EventTest {

    @Test
    public void builder() throws Exception {
        //given
        Event event = Event.builder()
                .name("Inflearn spring rest api")
                .description("rest api development with spring")
                .build();
        assertThat(event).isNotNull();


    }

    @Test
    public void javaBean() throws Exception {
        //given
        Event event = new Event();
        String name = "event";

        //when
        event.setName("Event");
        String description = "spring";
        event.setDescription(description);

        //then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }



}