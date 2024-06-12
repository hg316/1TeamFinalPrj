package com.sds.animalapp.model.shelter;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sds.animalapp.domain.Shelter;
import com.sds.animalapp.domain.ShelterSelectParam;

@Mapper
public interface ShelterDAO {
	public int selectCount(String keyword); //총 레코드 수
	public List selectAll(ShelterSelectParam shelterSelectParam);
	public List getAllRecord();
	public Shelter select(int shelter_idx);
	public void insert(List<Shelter> shelterAllList);
	public void updateSidoCode(@Param("id") String id, @Param("orgCd") String orgCd);
	public void updateSignguCode(@Param("id") String id, @Param("orgCd") String orgCd);
	public void delete(List<Shelter> shelterAllList);
}