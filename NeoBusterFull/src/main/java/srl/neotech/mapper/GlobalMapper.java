package srl.neotech.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import srl.neotech.entity.Person;
import srl.neotech.model.Attore;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface GlobalMapper {

	GlobalMapper INSTANCE = Mappers.getMapper( GlobalMapper.class ); 
	
   
	  @Mapping(source = "id", target = "movie_id")
	  @Mapping(source = "movieStatus", target = "movie_status")
	  srl.neotech.model.Movie  movieEntityToMovie(srl.neotech.entity.Movie entity);
	  
	  
	  Attore personToAttore(Person person);
	  
	  
    
}
