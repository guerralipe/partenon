package br.com.syspartenon.partenon.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.com.syspartenon.partenon.domain.Entidade;

@PersistenceController
public class EntidadeDAO extends JPACrud<Entidade, Integer> {
    
}
