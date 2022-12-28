package com.bootcamp.blog.service;

import com.bootcamp.blog.dto.MensajeExceptionDto;
import com.bootcamp.blog.dto.response.EntradaBlogRequestDto;
import com.bootcamp.blog.dto.response.EntradaBlogResponseDto;
import com.bootcamp.blog.dto.response.MensajeEntradaBlogResponseDto;
import com.bootcamp.blog.exception.DuplicateException;
import com.bootcamp.blog.exception.IdNotFoundException;
import com.bootcamp.blog.model.EntradaBlog;
import com.bootcamp.blog.repository.BlogRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService implements IBlogService{

    private final ModelMapper mapper = new ModelMapper();
    @Autowired
    BlogRepository blogRepository;

    public BlogService() {
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
    }

    @Override
    public List<EntradaBlogResponseDto> getEntradaBlogResponseDtos(String id) {
        if (id == null) {
            return blogRepository.getEntradasBlog().stream()
                    .map(e -> mapper.map(e, EntradaBlogResponseDto.class))
                    .collect(Collectors.toList());
        } else {
            List<EntradaBlogResponseDto> entradaBlogResponseDtos =
                    blogRepository.getEntradasBlog().stream().filter(e -> e.getId().equals(id)).collect(Collectors.toList())
                            .stream().map(e -> mapper.map(e, EntradaBlogResponseDto.class)).collect(Collectors.toList());
            if(entradaBlogResponseDtos.size() > 0) {
                return entradaBlogResponseDtos;
            } else {
                throw  new IdNotFoundException(new MensajeExceptionDto("Que mirás bobo, el Blog no se encuentra"));
            }
        }
    }

    @Override
    public MensajeEntradaBlogResponseDto addEntrada(EntradaBlogRequestDto entradaBlogRequestDto) {
        if( blogRepository.agregarEntradaBlog(
                mapper.map(entradaBlogRequestDto, EntradaBlog.class) ) ) {
            return new MensajeEntradaBlogResponseDto("Alta",entradaBlogRequestDto);
        } else {
            throw  new DuplicateException(new MensajeExceptionDto("El Blog no se pudo guardar porque ya existe"));
        }
    }
}