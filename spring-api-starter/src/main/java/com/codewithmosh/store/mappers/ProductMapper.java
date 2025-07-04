package com.codewithmosh.store.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.codewithmosh.store.dtos.ProductDto;
import com.codewithmosh.store.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);

    Product toEntity(ProductDto productDto);

    @Mapping(target = "id", ignore = true) //Ignore ID when updating
    void update(ProductDto productDto, @MappingTarget Product product);
}
