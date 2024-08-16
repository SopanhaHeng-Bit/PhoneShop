package com.panha.java.phoneTest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaginationDTO {
    private int pageNumber;
    private int pageSize;
    private int totalPage;
    private long totalElement;
    private long numberOfElement;
    private boolean empty;
    private boolean first;
    private boolean last;
}
