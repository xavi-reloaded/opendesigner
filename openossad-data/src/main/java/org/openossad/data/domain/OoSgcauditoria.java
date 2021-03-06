package org.openossad.data.domain;

// Generated 03-oct-2010 22:27:17 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * OoSgcauditoria generated by hbm2java
 */
public class OoSgcauditoria implements java.io.Serializable {

	private String idx;
	private Date afechaCreacion;
	private Integer aestado;
	private String adescripcion;
	private String asistema;
	private String asitio;
	private String aproceso;
	private String aproducto;
	private String aproveedor;
	private String aactividad;
	private String aservicio;
	private String atipoAuditoria;
	private String acliente;
	private String arespAnalisis;
	private String arespDecision;
	private Integer ahoras;
	private Date afechaPrevista;
	private String aautor;
	private String aparticipantes;

	public OoSgcauditoria() {
	}

	public OoSgcauditoria(String idx, Date afechaCreacion) {
		this.idx = idx;
		this.afechaCreacion = afechaCreacion;
	}

	public OoSgcauditoria(String idx, Date afechaCreacion, Integer aestado,
			String adescripcion, String asistema, String asitio,
			String aproceso, String aproducto, String aproveedor,
			String aactividad, String aservicio, String atipoAuditoria,
			String acliente, String arespAnalisis, String arespDecision,
			Integer ahoras, Date afechaPrevista, String aautor,
			String aparticipantes) {
		this.idx = idx;
		this.afechaCreacion = afechaCreacion;
		this.aestado = aestado;
		this.adescripcion = adescripcion;
		this.asistema = asistema;
		this.asitio = asitio;
		this.aproceso = aproceso;
		this.aproducto = aproducto;
		this.aproveedor = aproveedor;
		this.aactividad = aactividad;
		this.aservicio = aservicio;
		this.atipoAuditoria = atipoAuditoria;
		this.acliente = acliente;
		this.arespAnalisis = arespAnalisis;
		this.arespDecision = arespDecision;
		this.ahoras = ahoras;
		this.afechaPrevista = afechaPrevista;
		this.aautor = aautor;
		this.aparticipantes = aparticipantes;
	}

	public String getIdx() {
		return this.idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public Date getAfechaCreacion() {
		return this.afechaCreacion;
	}

	public void setAfechaCreacion(Date afechaCreacion) {
		this.afechaCreacion = afechaCreacion;
	}

	public Integer getAestado() {
		return this.aestado;
	}

	public void setAestado(Integer aestado) {
		this.aestado = aestado;
	}

	public String getAdescripcion() {
		return this.adescripcion;
	}

	public void setAdescripcion(String adescripcion) {
		this.adescripcion = adescripcion;
	}

	public String getAsistema() {
		return this.asistema;
	}

	public void setAsistema(String asistema) {
		this.asistema = asistema;
	}

	public String getAsitio() {
		return this.asitio;
	}

	public void setAsitio(String asitio) {
		this.asitio = asitio;
	}

	public String getAproceso() {
		return this.aproceso;
	}

	public void setAproceso(String aproceso) {
		this.aproceso = aproceso;
	}

	public String getAproducto() {
		return this.aproducto;
	}

	public void setAproducto(String aproducto) {
		this.aproducto = aproducto;
	}

	public String getAproveedor() {
		return this.aproveedor;
	}

	public void setAproveedor(String aproveedor) {
		this.aproveedor = aproveedor;
	}

	public String getAactividad() {
		return this.aactividad;
	}

	public void setAactividad(String aactividad) {
		this.aactividad = aactividad;
	}

	public String getAservicio() {
		return this.aservicio;
	}

	public void setAservicio(String aservicio) {
		this.aservicio = aservicio;
	}

	public String getAtipoAuditoria() {
		return this.atipoAuditoria;
	}

	public void setAtipoAuditoria(String atipoAuditoria) {
		this.atipoAuditoria = atipoAuditoria;
	}

	public String getAcliente() {
		return this.acliente;
	}

	public void setAcliente(String acliente) {
		this.acliente = acliente;
	}

	public String getArespAnalisis() {
		return this.arespAnalisis;
	}

	public void setArespAnalisis(String arespAnalisis) {
		this.arespAnalisis = arespAnalisis;
	}

	public String getArespDecision() {
		return this.arespDecision;
	}

	public void setArespDecision(String arespDecision) {
		this.arespDecision = arespDecision;
	}

	public Integer getAhoras() {
		return this.ahoras;
	}

	public void setAhoras(Integer ahoras) {
		this.ahoras = ahoras;
	}

	public Date getAfechaPrevista() {
		return this.afechaPrevista;
	}

	public void setAfechaPrevista(Date afechaPrevista) {
		this.afechaPrevista = afechaPrevista;
	}

	public String getAautor() {
		return this.aautor;
	}

	public void setAautor(String aautor) {
		this.aautor = aautor;
	}

	public String getAparticipantes() {
		return this.aparticipantes;
	}

	public void setAparticipantes(String aparticipantes) {
		this.aparticipantes = aparticipantes;
	}

}
