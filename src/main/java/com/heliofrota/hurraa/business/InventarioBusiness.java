/*
 *   Hurraa http://github.com/heliofrota/hurraa/
 *
 *   This file is part of Hurraa.
 *
 *   Hurraa is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Hurraa is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Hurraa.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.heliofrota.hurraa.business;

import java.util.List;

import com.heliofrota.hurraa.entity.inventario.Fabricante;

/**
 * Classe de negocio UsuarioBusinessImpl.
 *
 * @author helio frota
 *
 */
public interface InventarioBusiness {

    /**
     * Busca fabricantes via camada de persistencia com determinado limite e
     * offset.
     *
     * @param inicio int
     * @param limite int
     * @return List < Fabricante >
     */
    public List<Fabricante> getFabricantes(int inicio, int limite);

    public void saveFabricante(Fabricante fabricante);
}
