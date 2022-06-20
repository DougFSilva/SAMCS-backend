package com.douglas.SAMC.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.douglas.SAMC.enums.AlunoStatus;
import com.douglas.SAMC.enums.EntradaSaida;
import com.douglas.SAMC.model.Aluno;
import com.douglas.SAMC.model.Turma;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer> {

	Optional<Aluno> findByMatricula(Integer matricula);

	Optional<Aluno> findByTag(Integer tag);

	List<Aluno> findAllByNomeContaining(String nome);

	List<Aluno> findAllByTurmaOrderByNome(Turma turma);

	List<Aluno> findAllByEntradaSaidaOrderByNome(EntradaSaida entradaSaida);

	List<Aluno> findAllByTurmaCodigoOrderByNome(String codigo);

	List<Aluno> findAllByDesbloqueioTemporarioOrderByNome(boolean resolvido);

	List<Aluno> findAllByStatusOrderByNome(AlunoStatus alunoStatus);

	List<Aluno> findByTurmaAndStatusOrderByNome(Turma turma, AlunoStatus status);

	List<Aluno> findAllByTurmaCursoIdOrderByNome(Integer idCurso);

	List<Aluno> findAllByTurmaCursoIdAndStatusOrderByNome(Integer idCurso, AlunoStatus status);

	List<Aluno> findByTurma(Turma turma);

	List<Aluno> findAllByTurmaIdOrderByNome(Integer idTurmaAtual);

}