package com.upc.monitoringsystem.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Chasis {
    private Long cpus;
    private Long memoryMax;
    private Long memoryTotal;
    private Long memoryFree;
    private String elapseTime;
    private String spaceTotal;
    private String spaceFree;
}
