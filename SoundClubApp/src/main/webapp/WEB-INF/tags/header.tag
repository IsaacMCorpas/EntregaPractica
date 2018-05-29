<%@ attribute name="page" required="true" type="java.lang.String"%>
<%@ attribute name="estilo" required="true" type="java.lang.String"%>
<header>
	<nav>
		<ul id="dropdown1" class="dropdown-content">
			<li class="tab disabled"><a href="#!">Perfil</a></li>
			<li><a href="./editarperfil.html">Editar</a></li>
			<li class="divider"></li>
			<li><a href="./index.html">Salir</a></li>
		</ul>
		<div class="nav-wrapper">
			<a href="paginaprincipal.html"><img src="assets/images/LOGO2.png"
				width="180" alt="LOGO2"></a>
			<ul id="imgheader" class="right hide-on-med-and-down">
				<li><a href="editarperfil.html"><img
						src="https://materializecss.com/images/yuna.jpg" alt="foto_perfil"
						class="circle"></a>
				<li><a class="dropdown-trigger" href="#!"
					data-target="dropdown1"><i class="material-icons right">arrow_drop_down</i></a></li>
			</ul>
		</div>
	</nav>

	<div class="row">
		<div class="col s12">
			<div class="row">
				<form action="./lista_usuarios" method="POST">
					<div class="input-field col s12">
						<i class="material-icons prefix">search</i> <input type="text"
							name="buscador" id="autocomplete-input" class="autocomplete2">
						<label for="autocomplete-input">Buscar...</label>
					</div>
					<input type="submit" />
				</form>
			</div>
		</div>
	</div>
</header>