package com.study.mycontact.repository;

import com.study.mycontact.domain.Block;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BlockRepositoryTest {
    @Autowired
    private BlockRepository blockRepository;

    @Test
    void crud() {
        Block block = new Block();
        block.setName("name_test");
        block.setReason("reason_test");
        block.setStartDate(LocalDate.now());
        block.setEndDate(LocalDate.now());

        blockRepository.save(block);

        List<Block> blocks = blockRepository.findAll();

        assertThat(blocks.size()).isEqualTo(1);
        assertThat(blocks.get(0).getName()).isEqualTo("name_test");
        assertThat(blocks.get(0).getReason()).isEqualTo("reason_test");
    }
}