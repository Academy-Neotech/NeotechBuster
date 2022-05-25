package srl.neotech.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;


public class DozerMapper {

	private static Mapper instance=null;
	
	
	private DozerMapper() {
		
	}
	
	public static Mapper getInstance() {
		if (instance==null) {
			instance=DozerBeanMapperBuilder.create().withMappingFiles("dozer-mapping.xml").build();
		}
		return instance;
	}
}
