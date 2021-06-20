package com.icbl.ems.utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class CommonUtility {

	private static ModelMapper mapper = new ModelMapper();
	{
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT).setSkipNullEnabled(true);
	}

	public static <S, D> D map(final S source, D destination) {
		mapper.map(source, destination);
		return destination;
	}

	public static <D, T> D map(final T source, Class<D> outClass) {
		return mapper.map(source, outClass);
	}

	public static <D, T> List<D> mapAll(final List<T> list, Class<D> targetClass) {
		return list.stream().map(obj -> map(obj, targetClass)).collect(Collectors.toList());
	}
}
