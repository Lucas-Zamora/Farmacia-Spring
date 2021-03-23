package com.farmaciagen.farmaciag.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmaciagen.farmaciag.Model.ProdModel;

@Repository
public interface ProdRepository extends JpaRepository<ProdModel, Long> {
	public List<ProdModel> findAllByTituloContainingIgnoreCase(String titulo);
}
