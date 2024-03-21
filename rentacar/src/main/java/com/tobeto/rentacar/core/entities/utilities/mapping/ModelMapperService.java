package com.tobeto.rentacar.core.entities.utilities.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

    ModelMapper forRequest();
    ModelMapper forResponse();


}
