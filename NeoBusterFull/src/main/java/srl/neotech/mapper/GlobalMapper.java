package srl.neotech.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface GlobalMapper {

	GlobalMapper INSTANCE = Mappers.getMapper( GlobalMapper.class ); 
	
   
	  @Mapping(source = "id", target = "movie_id")
	  @Mapping(source = "movieStatus", target = "movie_status")
	  srl.neotech.model.Movie  movieEntityToMovie(srl.neotech.entity.Movie entity);
    
}
