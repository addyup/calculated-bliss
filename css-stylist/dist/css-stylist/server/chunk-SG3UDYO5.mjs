import './polyfills.server.mjs';
import{A as P,B as D,E as A,I as L,L as T,a as h,b as v,c as r,d as C,e as S,f as y,g as k,h as n,i,j as l,k as s,l as x,m as a,r as w,u as M,w as O,x as _,y as F,z as I}from"./chunk-CUHOYWAS.mjs";var c=class e{title="css-stylist";static \u0275fac=function(t){return new(t||e)};static \u0275cmp=r({type:e,selectors:[["app-root"]],standalone:!0,features:[a],decls:1,vars:0,template:function(t,p){t&1&&l(0,"router-outlet")},dependencies:[L]})};var g=class e{constructor(o){this.http=o}apiUrl="http://localhost:8080/api/tickets/scrape";getString(){return this.http.get(this.apiUrl,{responseType:"text"})}static \u0275fac=function(t){return new(t||e)(v(F))};static \u0275prov=h({token:e,factory:e.\u0275fac,providedIn:"root"})};function H(e,o){if(e&1&&(n(0,"div",2),s(1),i()),e&2){let t=o.$implicit;C(),x(" ",t,`
`)}}var d=class e{constructor(o){this.myService=o}myString;splitStrings=[];ngOnInit(){this.myService.getString().subscribe(o=>{this.splitStrings=o.split(",").filter(t=>!this.shouldFilter(t))},o=>{console.error("Error fetching data",o)})}shouldFilter(o){return["Imprint/Promotion Label:","Grammys 2025: Who Will Nab Nominations in the Top Country Categories?","Gains in Weekly Performance","Additional Awards"].some(p=>o.includes(p))}static \u0275fac=function(t){return new(t||e)(S(g))};static \u0275cmp=r({type:e,selectors:[["app-showtime-scrape-component"]],standalone:!0,features:[a],decls:4,vars:1,consts:[[1,"billboard"],["class","names",4,"ngFor","ngForOf"],[1,"names"]],template:function(t,p){t&1&&(n(0,"div")(1,"h4",0),s(2,"Billboard Top 200"),i()(),y(3,H,2,1,"div",1)),t&2&&(C(3),k("ngForOf",p.splitStrings))},dependencies:[_,O],styles:[".billboard[_ngcontent-%COMP%]{background:linear-gradient(to right,salmon,#40e0d0);color:transparent;background-clip:text;display:inline-block}.names[_ngcontent-%COMP%]{background:linear-gradient(to right,salmon,#40e0d0);color:transparent;background-clip:text}",`.billboard[_ngcontent-%COMP%] {
      position: relative;
      content: '';
      display: block;
      width: 260px;
      filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#00ffffff',GradientType=0 );
      background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(140,198,63,1)), color-stop(100%, rgba(30,71,146,1)));
      background: -webkit-linear-gradient(left, rgba(140,198,63,1) 0%, rgba(30,71,146,1) 100%);
      background:    -moz-linear-gradient(right, rgba(140,198,63,1) 0%, rgba(30,71,146,1) 100%);
      background:     -ms-linear-gradient(right, rgba(140,198,63,1) 0%, rgba(30,71,146,1) 100%);
      background:      -o-linear-gradient(right, rgba(140,198,63,1) 0%, rgba(30,71,146,1) 100%);
      background:         linear-gradient(to right, rgba(140,198,63,1) 0%, rgba(30,71,146,1) 100%);
  }
  .names[_ngcontent-%COMP%] {
    color: #000;
    background: #fff;
    mix-blend-mode: lighten;
  }`]})};var f=class e{static \u0275fac=function(t){return new(t||e)};static \u0275cmp=r({type:e,selectors:[["app-logo"]],standalone:!0,features:[a],decls:5,vars:0,consts:[[1,"logo-container"],["src","../../assets/Favicon-01.png",1,"logo-top-right"],["href","/social-links"],["src","../../assets/Logo 3D Render- White Background 30.jpg","alt","Center Logo",1,"logo-center"]],template:function(t,p){t&1&&(n(0,"div",0),l(1,"img",1),n(2,"a",2),l(3,"img",3),i()(),l(4,"app-showtime-scrape-component"))},dependencies:[d],styles:[".logo-container[_ngcontent-%COMP%]{position:relative;width:100%;height:100vh;display:flex;justify-content:center;align-items:center}.logo-top-right[_ngcontent-%COMP%]{position:absolute;top:20px;right:20px;width:100px}.logo-center[_ngcontent-%COMP%]{width:200px;cursor:pointer}"]})};var u=class e{static \u0275fac=function(t){return new(t||e)};static \u0275cmp=r({type:e,selectors:[["app-social-links"]],standalone:!0,features:[a],decls:7,vars:0,consts:[[1,"social-links"],["href","https://soundcloud.com/calcbliss","target","_blank"],["href","https://www.instagram.com/addyuprety/","target","_blank"],["href","https://www.linkedin.com/in/adwait-uprety-79a54b308","target","_blank"]],template:function(t,p){t&1&&(n(0,"div",0)(1,"a",1),s(2,"SoundCloud"),i(),n(3,"a",2),s(4,"Instagram"),i(),n(5,"a",3),s(6,"LinkedIn"),i()())},styles:[".social-links[_ngcontent-%COMP%]{display:flex;flex-direction:column;align-items:center;justify-content:center;height:100vh}.social-links[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{text-decoration:none;color:#000;font-size:24px;margin:10px 0;transition:color .3s}.social-links[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]:hover{color:#007bff}"]})};var j=[{path:"",component:f},{path:"social-links",component:u}];var E={providers:[w({eventCoalescing:!0}),T(j),D(),I()]};var W={providers:[A()]},N=M(E,W);var G=()=>P(c,N),ut=G;export{ut as a};
