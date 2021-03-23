package com.farmaciagen.farmaciag.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmaciagen.farmaciag.Model.FarModel;

@Repository
public interface FarRepository extends JpaRepository<FarModel, Long> {
	public List<FarModel> findAllByTituloContainingIgnoreCase(String titulo);
}
