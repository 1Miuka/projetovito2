package catinder.admin.siteadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import catinder.admin.siteadmin.entidades.Cat;

public interface CatRepository extends JpaRepository<Cat, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
}