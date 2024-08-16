package com.panha.java.phoneTest.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;
@Data
public class PageDTO {
    private List<?> list;
    PaginationDTO paginationDTO;

    public PageDTO(Page<?> page){
        this.list = page.getContent();
        this.paginationDTO = PaginationDTO.builder()
                .pageSize(page.getPageable().getPageSize())
                .pageNumber(page.getPageable().getPageNumber() + 1)
                .totalPage(page.getTotalPages())
                .totalElement(page.getTotalElements())
                .numberOfElement(page.getNumberOfElements())
                .empty(page.isEmpty())
                .first(page.isFirst())
                .last(page.isLast())
                .build();
    }
}
