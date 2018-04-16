package com.skillsup.services.convert.impl;

import com.skillsup.DAO.model.Product;
import com.skillsup.services.DTO.ProductDTO;
import com.skillsup.services.convert.ProductConvert;

public class ProductConvertImpl implements ProductConvert {

    @Override
    public Product toEntity(ProductDTO dto) {
        return new Product(dto.getName(), dto.getCategory(), dto.getColor(), dto.getParameter(), dto.getCount(), dto.getPrice(), null);
    }

    @Override
    public ProductDTO toDto(Product entity) {
        return new ProductDTO(entity.getName(),entity.getCategory(),entity.getColor(),entity.getParameter(),entity.getCount(),entity.getPrice());
    }
}
